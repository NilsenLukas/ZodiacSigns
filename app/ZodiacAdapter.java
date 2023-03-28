public class ZodiacAdapter extends RecyclerView.Adapter<ZodiacAdapter.ZodiacViewHolder> {

    private List<Zodiac> zodiacList;

    public ZodiacAdapter(List<Zodiac> zodiacList) {
        this.zodiacList = zodiacList;
    }

    @NonNull
    @Override
    public ZodiacViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_zodiac, parent, false);
        return new ZodiacViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ZodiacViewHolder holder, int position) {
        Zodiac zodiac = zodiacList.get(position);
        holder.zodiacImage.setImageResource(zodiac.getImageResource());
        holder.zodiacName.setText(zodiac.getName());
    }

    @Override
    public int getItemCount() {
        return zodiacList.size();
    }

    public static class ZodiacViewHolder extends RecyclerView.ViewHolder {
        public ImageView zodiacImage;
        public TextView zodiacName;

        public ZodiacViewHolder(View itemView) {
            super(itemView);
            zodiacImage = itemView.findViewById(R.id.zodiac_image);
            zodiacName = itemView.findViewById(R.id.zodiac_name);
        }
    }
}