package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Apps_outage: ImageVector
    get() {
        if (_Apps_outage != null) return _Apps_outage!!
        
        _Apps_outage = ImageVector.Builder(
            name = "apps_outage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                horizontalLineToRelative(4f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(20f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(14f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(20f)
                close()
                moveTo(19f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                close()
                moveTo(19.5f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(8f)
                close()
                moveTo(19.5f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.07f)
                curveTo(19.67f, 11.98f, 19.34f, 12f, 19f, 12f)
                curveToRelative(-1.07f, 0f, -2.09f, -0.24f, -3f, -0.68f)
                verticalLineTo(14f)
                close()
                moveTo(10f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.68f)
                curveTo(12.24f, 7.09f, 12f, 6.07f, 12f, 5f)
                curveToRelative(0f, -0.34f, 0.02f, -0.67f, 0.07f, -1f)
                horizontalLineTo(10f)
                close()
            }
        }.build()
        
        return _Apps_outage!!
    }

private var _Apps_outage: ImageVector? = null

