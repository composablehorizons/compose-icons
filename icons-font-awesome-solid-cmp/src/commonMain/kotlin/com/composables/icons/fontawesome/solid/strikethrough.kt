package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) return _Strikethrough!!
        
        _Strikethrough = ImageVector.Builder(
            name = "strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 224f)
                horizontalLineTo(293.9f)
                lineToRelative(-87.17f, -26.83f)
                arcTo(43.55f, 43.55f, 0f, false, true, 219.55f, 112f)
                horizontalLineToRelative(66.79f)
                arcTo(49.89f, 49.89f, 0f, false, true, 331f, 139.58f)
                arcToRelative(16f, 16f, 0f, false, false, 21.46f, 7.15f)
                lineToRelative(42.94f, -21.47f)
                arcToRelative(16f, 16f, 0f, false, false, 7.16f, -21.46f)
                lineToRelative(-0.53f, -1f)
                arcTo(128f, 128f, 0f, false, false, 287.51f, 32f)
                horizontalLineToRelative(-68f)
                arcToRelative(123.68f, 123.68f, 0f, false, false, -123f, 135.64f)
                curveToRelative(2f, 20.89f, 10.1f, 39.83f, 21.78f, 56.36f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(480f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(-180.24f, 96f)
                arcTo(43f, 43f, 0f, false, true, 336f, 356.45f)
                arcTo(43.59f, 43.59f, 0f, false, true, 292.45f, 400f)
                horizontalLineToRelative(-66.79f)
                arcTo(49.89f, 49.89f, 0f, false, true, 181f, 372.42f)
                arcToRelative(16f, 16f, 0f, false, false, -21.46f, -7.15f)
                lineToRelative(-42.94f, 21.47f)
                arcToRelative(16f, 16f, 0f, false, false, -7.16f, 21.46f)
                lineToRelative(0.53f, 1f)
                arcTo(128f, 128f, 0f, false, false, 224.49f, 480f)
                horizontalLineToRelative(68f)
                arcToRelative(123.68f, 123.68f, 0f, false, false, 123f, -135.64f)
                arcToRelative(114.25f, 114.25f, 0f, false, false, -5.34f, -24.36f)
                close()
            }
        }.build()
        
        return _Strikethrough!!
    }

private var _Strikethrough: ImageVector? = null

