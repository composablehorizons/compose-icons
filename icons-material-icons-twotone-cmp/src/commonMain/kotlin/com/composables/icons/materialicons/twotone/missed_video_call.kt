package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Missed_video_call: ImageVector
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
                moveTo(15f, 13.5f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(11f, 15f)
                lineToRelative(-3.89f, -3.89f)
                verticalLineToRelative(2.55f)
                horizontalLineTo(6f)
                verticalLineTo(9.22f)
                horizontalLineToRelative(4.44f)
                verticalLineToRelative(1.11f)
                horizontalLineTo(7.89f)
                lineToRelative(3.11f, 3.1f)
                lineToRelative(2.99f, -3.01f)
                lineToRelative(0.78f, 0.79f)
                lineTo(11f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-11f)
                lineToRelative(-4f, 4f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(2f, -9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                close()
                moveToRelative(6f, 5.43f)
                lineToRelative(-3.11f, -3.1f)
                horizontalLineToRelative(2.55f)
                verticalLineTo(9.22f)
                horizontalLineTo(6f)
                verticalLineToRelative(4.44f)
                horizontalLineToRelative(1.11f)
                verticalLineToRelative(-2.55f)
                lineTo(11f, 15f)
                lineToRelative(3.77f, -3.79f)
                lineToRelative(-0.78f, -0.79f)
                close()
            }
        }.build()
        
        return _Missed_video_call!!
    }

private var _Missed_video_call: ImageVector? = null

