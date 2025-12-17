package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Hotel_class: ImageVector
    get() {
        if (_Hotel_class != null) return _Hotel_class!!
        
        _Hotel_class = ImageVector.Builder(
            name = "hotel_class",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.58f, 10f)
                horizontalLineTo(1f)
                lineToRelative(6.17f, 4.41f)
                lineTo(4.83f, 22f)
                lineTo(11f, 17.31f)
                lineTo(17.18f, 22f)
                lineToRelative(-2.35f, -7.59f)
                lineTo(21f, 10f)
                horizontalLineToRelative(-7.58f)
                lineTo(11f, 2f)
                lineTo(8.58f, 10f)
                close()
                moveTo(21.36f, 22f)
                lineToRelative(-1.86f, -6.01f)
                lineTo(23.68f, 13f)
                horizontalLineToRelative(-3.44f)
                lineToRelative(-3.08f, 2.2f)
                lineToRelative(1.46f, 4.72f)
                lineTo(21.36f, 22f)
                close()
                moveTo(17f, 8f)
                lineToRelative(-1.82f, -6f)
                lineToRelative(-1.04f, 3.45f)
                lineTo(14.91f, 8f)
                horizontalLineTo(17f)
                close()
            }
        }.build()
        
        return _Hotel_class!!
    }

private var _Hotel_class: ImageVector? = null

