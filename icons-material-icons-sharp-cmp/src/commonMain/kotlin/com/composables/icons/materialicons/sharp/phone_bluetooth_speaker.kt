package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phone_bluetooth_speaker: ImageVector
    get() {
        if (_Phone_bluetooth_speaker != null) return _Phone_bluetooth_speaker!!
        
        _Phone_bluetooth_speaker = ImageVector.Builder(
            name = "phone_bluetooth_speaker",
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
                moveTo(14.71f, 9.5f)
                lineTo(17f, 7.21f)
                verticalLineTo(11f)
                horizontalLineToRelative(0.5f)
                lineToRelative(2.85f, -2.85f)
                lineTo(18.21f, 6f)
                lineToRelative(2.15f, -2.15f)
                lineTo(17.5f, 1f)
                horizontalLineTo(17f)
                verticalLineToRelative(3.79f)
                lineTo(14.71f, 2.5f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(16.79f, 6f)
                lineTo(14f, 8.79f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(18f, 2.91f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                verticalLineTo(2.91f)
                close()
                moveToRelative(0f, 4.3f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                verticalLineTo(7.21f)
                close()
                moveToRelative(3f, 8.25f)
                lineToRelative(-5.27f, -0.61f)
                lineToRelative(-2.52f, 2.52f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.53f, -2.53f)
                lineTo(8.54f, 3f)
                horizontalLineTo(3.03f)
                curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21f, 20.97f)
                verticalLineToRelative(-5.51f)
                close()
            }
        }.build()
        
        return _Phone_bluetooth_speaker!!
    }

private var _Phone_bluetooth_speaker: ImageVector? = null

