package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Wb_iridescent: ImageVector
    get() {
        if (_Wb_iridescent != null) return _Wb_iridescent!!
        
        _Wb_iridescent = ImageVector.Builder(
            name = "wb_iridescent",
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
                moveTo(7f, 11f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 15f)
                horizontalLineToRelative(14f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(2f, -4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(4f, -10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(6.25f, 4.39f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.8f, -1.79f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(11f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(6.24f, -1.29f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-1.8f, -1.79f)
                close()
                moveTo(5.34f, 6.805f)
                lineToRelative(-1.788f, -1.79f)
                lineTo(4.96f, 3.61f)
                lineToRelative(1.788f, 1.788f)
                close()
                moveTo(3.55f, 19.08f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Wb_iridescent!!
    }

private var _Wb_iridescent: ImageVector? = null

