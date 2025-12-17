package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Recent_actors: ImageVector
    get() {
        if (_Recent_actors != null) return _Recent_actors!!
        
        _Recent_actors = ImageVector.Builder(
            name = "recent_actors",
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
                moveTo(13f, 7f)
                horizontalLineTo(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                verticalLineTo(7f)
                close()
                moveTo(8f, 8f)
                curveToRelative(1.07f, 0f, 1.95f, 0.87f, 1.95f, 1.95f)
                curveToRelative(0f, 1.07f, -0.87f, 1.95f, -1.95f, 1.95f)
                reflectiveCurveToRelative(-1.95f, -0.87f, -1.95f, -1.95f)
                reflectiveCurveTo(6.93f, 8f, 8f, 8f)
                close()
                moveToRelative(3.89f, 8f)
                horizontalLineTo(4.11f)
                verticalLineToRelative(-0.65f)
                curveToRelative(0f, -1.3f, 2.59f, -1.95f, 3.89f, -1.95f)
                reflectiveCurveToRelative(3.89f, 0.65f, 3.89f, 1.95f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-3f, 14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                close()
                moveTo(3f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.95f, 9.94f)
                arcTo(1.95f, 1.95f, 0f, false, true, 8f, 11.89f)
                arcTo(1.95f, 1.95f, 0f, false, true, 6.05f, 9.94f)
                arcTo(1.95f, 1.95f, 0f, false, true, 9.95f, 9.94f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 13.4f)
                curveToRelative(-1.3f, 0f, -3.89f, 0.65f, -3.89f, 1.95f)
                verticalLineTo(16f)
                horizontalLineToRelative(7.78f)
                verticalLineToRelative(-0.65f)
                curveToRelative(0f, -1.3f, -2.59f, -1.95f, -3.89f, -1.95f)
                close()
            }
        }.build()
        
        return _Recent_actors!!
    }

private var _Recent_actors: ImageVector? = null

