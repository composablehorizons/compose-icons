package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Child_friendly: ImageVector
    get() {
        if (_Child_friendly != null) return _Child_friendly!!
        
        _Child_friendly = ImageVector.Builder(
            name = "child_friendly",
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
                moveTo(13f, 3.08f)
                verticalLineTo(10f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, -4.03f, -2.98f, -7.37f, -6.86f, -7.92f)
                curveToRelative(-0.6f, -0.09f, -1.14f, 0.39f, -1.14f, 1f)
                close()
                moveToRelative(6.32f, 12.81f)
                curveTo(20.37f, 14.54f, 21f, 12.84f, 21f, 11f)
                horizontalLineTo(6.44f)
                lineToRelative(-0.68f, -1.43f)
                curveTo(5.6f, 9.22f, 5.24f, 9f, 4.86f, 9f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.22f)
                reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f)
                curveToRelative(-1.33f, 0.71f, -2.14f, 2.27f, -1.74f, 3.94f)
                curveToRelative(0.3f, 1.26f, 1.34f, 2.27f, 2.6f, 2.55f)
                curveToRelative(2.1f, 0.46f, 3.98f, -0.96f, 4.25f, -2.91f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.27f, 1.94f, 2.14f, 3.36f, 4.22f, 2.92f)
                curveToRelative(1.27f, -0.27f, 2.31f, -1.27f, 2.63f, -2.53f)
                curveToRelative(0.35f, -1.39f, -0.14f, -2.68f, -1.06f, -3.5f)
                close()
                moveTo(8f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(7.17f, 17f, 8f, 17f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(8.83f, 20f, 8f, 20f)
                close()
                moveToRelative(9f, 0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(16.17f, 17f, 17f, 17f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.83f, 20f, 17f, 20f)
                close()
            }
        }.build()
        
        return _Child_friendly!!
    }

private var _Child_friendly: ImageVector? = null

