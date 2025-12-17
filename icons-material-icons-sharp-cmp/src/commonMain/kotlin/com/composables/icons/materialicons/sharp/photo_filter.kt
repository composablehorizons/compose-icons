package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Photo_filter: ImageVector
    get() {
        if (_Photo_filter != null) return _Photo_filter!!
        
        _Photo_filter = ImageVector.Builder(
            name = "photo_filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 10f)
                verticalLineToRelative(9f)
                horizontalLineTo(4.98f)
                verticalLineTo(5f)
                horizontalLineToRelative(9f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(10f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-2f, 0f)
                lineToRelative(0.94f, -2.06f)
                lineTo(20f, 7f)
                lineToRelative(-2.06f, -0.94f)
                lineTo(17f, 4f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(14f, 7f)
                lineToRelative(2.06f, 0.94f)
                lineTo(17f, 10f)
                close()
                moveToRelative(-3.75f, 0.75f)
                lineTo(12f, 8f)
                lineToRelative(-1.25f, 2.75f)
                lineTo(8f, 12f)
                lineToRelative(2.75f, 1.25f)
                lineTo(12f, 16f)
                lineToRelative(1.25f, -2.75f)
                lineTo(16f, 12f)
                lineToRelative(-2.75f, -1.25f)
                close()
            }
        }.build()
        
        return _Photo_filter!!
    }

private var _Photo_filter: ImageVector? = null

