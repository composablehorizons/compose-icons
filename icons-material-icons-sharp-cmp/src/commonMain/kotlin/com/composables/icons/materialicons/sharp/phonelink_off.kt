package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phonelink_off: ImageVector
    get() {
        if (_Phonelink_off != null) return _Phonelink_off!!
        
        _Phonelink_off = ImageVector.Builder(
            name = "phonelink_off",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.56f, 4f)
                lineToRelative(-2.5f, -2.49f)
                lineTo(4.56f, 4f)
                close()
                moveTo(24f, 8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(4.61f)
                lineToRelative(2f, 2f)
                verticalLineTo(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(3f, 3f)
                horizontalLineTo(24f)
                close()
                moveToRelative(-2f, -2f)
                verticalLineTo(4f)
                horizontalLineTo(7.39f)
                lineToRelative(2f, 2f)
                close()
                moveTo(2.06f, 1.51f)
                lineTo(0.65f, 2.92f)
                lineTo(2f, 4.27f)
                verticalLineTo(17f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.06f, 1.51f)
                close()
                moveTo(4f, 17f)
                verticalLineTo(6.27f)
                lineTo(14.73f, 17f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Phonelink_off!!
    }

private var _Phonelink_off: ImageVector? = null

