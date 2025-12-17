package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Speed: ImageVector
    get() {
        if (_Speed != null) return _Speed!!
        
        _Speed = ImageVector.Builder(
            name = "speed",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.46f, 10f)
                arcToRelative(1f, 1f, 0f, false, false, -0.07f, 1f)
                arcToRelative(7.55f, 7.55f, 0f, false, true, 0.52f, 1.81f)
                arcToRelative(8f, 8f, 0f, false, true, -0.69f, 4.73f)
                arcToRelative(1f, 1f, 0f, false, true, -0.89f, 0.53f)
                horizontalLineTo(5.68f)
                arcToRelative(1f, 1f, 0f, false, true, -0.89f, -0.54f)
                arcTo(8f, 8f, 0f, false, true, 13f, 6.06f)
                arcToRelative(7.69f, 7.69f, 0f, false, true, 2.11f, 0.56f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -0.07f)
                arcToRelative(1f, 1f, 0f, false, false, -0.17f, -1.76f)
                arcTo(10f, 10f, 0f, false, false, 3.35f, 19f)
                arcToRelative(2f, 2f, 0f, false, false, 1.72f, 1f)
                horizontalLineToRelative(13.85f)
                arcToRelative(2f, 2f, 0f, false, false, 1.74f, -1f)
                arcToRelative(10f, 10f, 0f, false, false, 0.55f, -8.89f)
                arcToRelative(1f, 1f, 0f, false, false, -1.75f, -0.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.59f, 12.59f)
                arcToRelative(2f, 2f, 0f, false, false, 2.83f, 2.83f)
                lineToRelative(5.66f, -8.49f)
                close()
            }
        }.build()
        
        return _Speed!!
    }

private var _Speed: ImageVector? = null

