package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Biking: ImageVector
    get() {
        if (_Biking != null) return _Biking!!
        
        _Biking = ImageVector.Builder(
            name = "biking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 96f)
                arcToRelative(48f, 48f, 0f, true, false, -48f, -48f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                close()
                moveToRelative(-4f, 121f)
                arcToRelative(31.9f, 31.9f, 0f, false, false, 20f, 7f)
                horizontalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, false, false, 0f, -64f)
                horizontalLineToRelative(-52.78f)
                lineTo(356f, 103f)
                arcToRelative(31.94f, 31.94f, 0f, false, false, -40.81f, 0.68f)
                lineToRelative(-112f, 96f)
                arcToRelative(32f, 32f, 0f, false, false, 3.08f, 50.92f)
                lineTo(288f, 305.12f)
                verticalLineTo(416f)
                arcToRelative(32f, 32f, 0f, false, false, 64f, 0f)
                verticalLineTo(288f)
                arcToRelative(32f, 32f, 0f, false, false, -14.25f, -26.62f)
                lineToRelative(-41.36f, -27.57f)
                lineToRelative(58.25f, -49.92f)
                close()
                moveToRelative(116f, 39f)
                arcToRelative(128f, 128f, 0f, true, false, 128f, 128f)
                arcToRelative(128f, 128f, 0f, false, false, -128f, -128f)
                close()
                moveToRelative(0f, 192f)
                arcToRelative(64f, 64f, 0f, true, true, 64f, -64f)
                arcToRelative(64f, 64f, 0f, false, true, -64f, 64f)
                close()
                moveTo(128f, 256f)
                arcToRelative(128f, 128f, 0f, true, false, 128f, 128f)
                arcToRelative(128f, 128f, 0f, false, false, -128f, -128f)
                close()
                moveToRelative(0f, 192f)
                arcToRelative(64f, 64f, 0f, true, true, 64f, -64f)
                arcToRelative(64f, 64f, 0f, false, true, -64f, 64f)
                close()
            }
        }.build()
        
        return _Biking!!
    }

private var _Biking: ImageVector? = null

