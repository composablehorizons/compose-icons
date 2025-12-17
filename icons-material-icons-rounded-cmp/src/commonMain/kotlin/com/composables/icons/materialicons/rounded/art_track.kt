package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Art_track: ImageVector
    get() {
        if (_Art_track != null) return _Art_track!!
        
        _Art_track = ImageVector.Builder(
            name = "art_track",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 13f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(-6f, 10f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(-3f, -8f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveToRelative(-2.1f, 5.2f)
                lineToRelative(-1.26f, -1.68f)
                curveToRelative(-0.2f, -0.26f, -0.59f, -0.27f, -0.8f, -0.01f)
                lineTo(6.5f, 14.26f)
                lineToRelative(-0.85f, -1.03f)
                curveToRelative(-0.2f, -0.25f, -0.58f, -0.24f, -0.78f, 0.01f)
                lineToRelative(-0.74f, 0.95f)
                curveToRelative(-0.26f, 0.33f, -0.02f, 0.81f, 0.39f, 0.81f)
                horizontalLineTo(9.5f)
                curveToRelative(0.41f, 0f, 0.65f, -0.47f, 0.4f, -0.8f)
                close()
            }
        }.build()
        
        return _Art_track!!
    }

private var _Art_track: ImageVector? = null

