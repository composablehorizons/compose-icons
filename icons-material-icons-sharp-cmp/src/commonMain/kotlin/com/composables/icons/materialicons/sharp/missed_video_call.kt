package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Missed_video_call: ImageVector
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
                moveTo(17f, 10.5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4.5f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-11f)
                lineToRelative(-4f, 4f)
                close()
                moveTo(10f, 15f)
                lineToRelative(-3.89f, -3.89f)
                verticalLineToRelative(2.55f)
                horizontalLineTo(5f)
                verticalLineTo(9.22f)
                horizontalLineToRelative(4.44f)
                verticalLineToRelative(1.11f)
                horizontalLineTo(6.89f)
                lineToRelative(3.11f, 3.1f)
                lineToRelative(4.22f, -4.22f)
                lineToRelative(0.78f, 0.79f)
                lineToRelative(-5f, 5f)
                close()
            }
        }.build()
        
        return _Missed_video_call!!
    }

private var _Missed_video_call: ImageVector? = null

