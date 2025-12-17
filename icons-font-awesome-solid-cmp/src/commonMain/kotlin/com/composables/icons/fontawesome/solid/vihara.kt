package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Vihara: ImageVector
    get() {
        if (_Vihara != null) return _Vihara!!
        
        _Vihara = ImageVector.Builder(
            name = "vihara",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(632.88f, 400.71f)
                lineTo(544f, 352f)
                verticalLineToRelative(-64f)
                lineToRelative(55.16f, -17.69f)
                curveToRelative(11.79f, -5.9f, 11.79f, -22.72f, 0f, -28.62f)
                lineTo(480f, 192f)
                verticalLineToRelative(-64f)
                lineToRelative(27.31f, -16.3f)
                curveToRelative(7.72f, -7.72f, 5.61f, -20.74f, -4.16f, -25.62f)
                lineTo(320f, 0f)
                lineTo(136.85f, 86.07f)
                curveToRelative(-9.77f, 4.88f, -11.88f, 17.9f, -4.16f, 25.62f)
                lineTo(160f, 128f)
                verticalLineToRelative(64f)
                lineTo(40.84f, 241.69f)
                curveToRelative(-11.79f, 5.9f, -11.79f, 22.72f, 0f, 28.62f)
                lineTo(96f, 288f)
                verticalLineToRelative(64f)
                lineTo(7.12f, 400.71f)
                curveToRelative(-5.42f, 3.62f, -7.7f, 9.63f, -7f, 15.29f)
                curveToRelative(0.62f, 5.01f, 3.57f, 9.75f, 8.72f, 12.33f)
                lineTo(64f, 448f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-48f)
                lineToRelative(55.15f, -19.67f)
                curveToRelative(5.16f, -2.58f, 8.1f, -7.32f, 8.72f, -12.33f)
                curveToRelative(0.71f, -5.67f, -1.57f, -11.68f, -6.99f, -15.29f)
                close()
                moveTo(224f, 128f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(64f)
                horizontalLineTo(224f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(-64f, 224f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(64f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Vihara!!
    }

private var _Vihara: ImageVector? = null

