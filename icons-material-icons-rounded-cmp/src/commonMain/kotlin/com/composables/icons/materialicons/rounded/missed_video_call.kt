package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Missed_video_call: ImageVector
    get() {
        if (_Missed_video_call != null) return _Missed_video_call!!
        
        _Missed_video_call = ImageVector.Builder(
            name = "missed_video_call",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 10.5f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f)
                verticalLineTo(8.91f)
                curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(17f, 10.5f)
                close()
                moveToRelative(-6.29f, 3.79f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-3.18f, -3.18f)
                verticalLineToRelative(2.55f)
                horizontalLineTo(5f)
                verticalLineTo(9.72f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.94f)
                verticalLineToRelative(1.11f)
                horizontalLineTo(6.89f)
                lineToRelative(3.11f, 3.1f)
                lineToRelative(4.22f, -4.22f)
                lineToRelative(0.78f, 0.79f)
                lineToRelative(-4.29f, 4.29f)
                close()
            }
        }.build()
        
        return _Missed_video_call!!
    }

private var _Missed_video_call: ImageVector? = null

