package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Collections: ImageVector
    get() {
        if (_Collections != null) return _Collections!!
        
        _Collections = ImageVector.Builder(
            name = "collections",
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
                moveTo(22f, 16f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveToRelative(-10.6f, -3.47f)
                lineToRelative(1.63f, 2.18f)
                lineToRelative(2.58f, -3.22f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.25f, 0.78f, 0f)
                lineToRelative(2.96f, 3.7f)
                curveToRelative(0.26f, 0.33f, 0.03f, 0.81f, -0.39f, 0.81f)
                horizontalLineTo(9f)
                curveToRelative(-0.41f, 0f, -0.65f, -0.47f, -0.4f, -0.8f)
                lineToRelative(2f, -2.67f)
                curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0f)
                close()
                moveTo(2f, 7f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Collections!!
    }

private var _Collections: ImageVector? = null

