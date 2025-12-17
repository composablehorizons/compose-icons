package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Recent_actors: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-4f, 14f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(14f)
                close()
                moveTo(14f, 5f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 7.75f)
                curveToRelative(1.24f, 0f, 2.25f, 1.01f, 2.25f, 2.25f)
                reflectiveCurveTo(9.24f, 12.25f, 8f, 12.25f)
                reflectiveCurveTo(5.75f, 11.24f, 5.75f, 10f)
                reflectiveCurveTo(6.76f, 7.75f, 8f, 7.75f)
                close()
                moveTo(12.5f, 17f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0f, -1.5f, 3f, -2.25f, 4.5f, -2.25f)
                reflectiveCurveToRelative(4.5f, 0.75f, 4.5f, 2.25f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Recent_actors!!
    }

private var _Recent_actors: ImageVector? = null

