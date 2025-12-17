package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.VolumeUp: ImageVector
    get() {
        if (_VolumeUp != null) return _VolumeUp!!
        
        _VolumeUp = ImageVector.Builder(
            name = "volume-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.536f, 14.01f)
                arcTo(8.47f, 8.47f, 0f, false, false, 14.026f, 8f)
                arcToRelative(8.47f, 8.47f, 0f, false, false, -2.49f, -6.01f)
                lineToRelative(-0.708f, 0.707f)
                arcTo(7.48f, 7.48f, 0f, false, true, 13.025f, 8f)
                curveToRelative(0f, 2.071f, -0.84f, 3.946f, -2.197f, 5.303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.121f, 12.596f)
                arcTo(6.48f, 6.48f, 0f, false, false, 12.025f, 8f)
                arcToRelative(6.48f, 6.48f, 0f, false, false, -1.904f, -4.596f)
                lineToRelative(-0.707f, 0.707f)
                arcTo(5.48f, 5.48f, 0f, false, true, 11.025f, 8f)
                arcToRelative(5.48f, 5.48f, 0f, false, true, -1.61f, 3.89f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.707f, 11.182f)
                arcTo(4.5f, 4.5f, 0f, false, false, 10.025f, 8f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -1.318f, -3.182f)
                lineTo(8f, 5.525f)
                arcTo(3.5f, 3.5f, 0f, false, true, 9.025f, 8f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8f, 10.475f)
                close()
                moveTo(6.717f, 3.55f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.812f, 0.39f)
                lineTo(3.825f, 10.5f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 10f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, -1.89f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.529f, -0.06f)
            }
        }.build()
        
        return _VolumeUp!!
    }

private var _VolumeUp: ImageVector? = null

