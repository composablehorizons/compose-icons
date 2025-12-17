package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Music_note: ImageVector
    get() {
        if (_Music_note != null) return _Music_note!!
        
        _Music_note = ImageVector.Builder(
            name = "music_note",
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
                moveTo(12.01f, 17f)
                arcTo(2f, 2f, 0f, false, true, 10.01f, 19f)
                arcTo(2f, 2f, 0f, false, true, 8.01f, 17f)
                arcTo(2f, 2f, 0f, false, true, 12.01f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                lineToRelative(0.01f, 10.55f)
                curveToRelative(-0.59f, -0.34f, -1.27f, -0.55f, -2f, -0.55f)
                curveTo(7.79f, 13f, 6f, 14.79f, 6f, 17f)
                reflectiveCurveToRelative(1.79f, 4f, 4.01f, 4f)
                reflectiveCurveTo(14f, 19.21f, 14f, 17f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineTo(3f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(-1.99f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.build()
        
        return _Music_note!!
    }

private var _Music_note: ImageVector? = null

