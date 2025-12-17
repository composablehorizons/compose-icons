package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PumpMedical: ImageVector
    get() {
        if (_PumpMedical != null) return _PumpMedical!!
        
        _PumpMedical = ImageVector.Builder(
            name = "pump-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(235.51f, 159.82f)
                horizontalLineTo(84.24f)
                arcTo(64f, 64f, 0f, false, false, 20.51f, 218f)
                lineTo(0.14f, 442f)
                arcToRelative(64f, 64f, 0f, false, false, 63.74f, 69.8f)
                horizontalLineToRelative(192f)
                arcTo(64f, 64f, 0f, false, false, 319.61f, 442f)
                lineTo(299.24f, 218f)
                arcTo(64f, 64f, 0f, false, false, 235.51f, 159.82f)
                close()
                moveToRelative(4.37f, 173.33f)
                arcToRelative(13.35f, 13.35f, 0f, false, true, -13.34f, 13.34f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                arcToRelative(13.33f, 13.33f, 0f, false, true, -13.33f, 13.33f)
                horizontalLineTo(146.54f)
                arcToRelative(13.33f, 13.33f, 0f, false, true, -13.33f, -13.33f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                arcToRelative(13.34f, 13.34f, 0f, false, true, -13.33f, -13.34f)
                verticalLineTo(306.49f)
                arcToRelative(13.33f, 13.33f, 0f, false, true, 13.33f, -13.34f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                arcToRelative(13.33f, 13.33f, 0f, false, true, 13.33f, -13.33f)
                horizontalLineToRelative(26.67f)
                arcToRelative(13.33f, 13.33f, 0f, false, true, 13.33f, 13.33f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                arcToRelative(13.34f, 13.34f, 0f, false, true, 13.34f, 13.34f)
                close()
                moveTo(379.19f, 93.88f)
                lineTo(335.87f, 50.56f)
                arcToRelative(64f, 64f, 0f, false, false, -45.24f, -18.74f)
                horizontalLineTo(223.88f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                horizontalLineToRelative(-64f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(66.75f)
                lineToRelative(43.31f, 43.31f)
                arcToRelative(16f, 16f, 0f, false, false, 22.63f, 0f)
                lineToRelative(22.62f, -22.62f)
                arcTo(16f, 16f, 0f, false, false, 379.19f, 93.88f)
                close()
            }
        }.build()
        
        return _PumpMedical!!
    }

private var _PumpMedical: ImageVector? = null

