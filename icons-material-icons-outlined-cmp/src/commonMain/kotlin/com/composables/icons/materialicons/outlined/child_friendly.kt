package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Child_friendly: ImageVector
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
                moveTo(13f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                close()
                moveToRelative(2f, 6f)
                verticalLineTo(4.34f)
                curveToRelative(1.7f, 0.6f, 3.05f, 1.95f, 3.66f, 3.66f)
                horizontalLineTo(15f)
                close()
                moveToRelative(-8.56f, 3f)
                lineToRelative(-0.95f, -2f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.22f)
                reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f)
                curveToRelative(-1.1f, 0.59f, -1.84f, 1.75f, -1.84f, 3.08f)
                curveTo(4.5f, 20.43f, 6.07f, 22f, 8f, 22f)
                curveToRelative(1.76f, 0f, 3.22f, -1.3f, 3.46f, -3f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.24f, 1.7f, 1.7f, 3f, 3.46f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.04f, -0.46f, -1.97f, -1.18f, -2.61f)
                curveTo(20.37f, 14.54f, 21f, 12.84f, 21f, 11f)
                horizontalLineTo(6.44f)
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
                moveToRelative(0.74f, -5.34f)
                lineToRelative(-0.29f, 0.37f)
                curveToRelative(-0.14f, -0.02f, -0.3f, -0.03f, -0.45f, -0.03f)
                curveToRelative(-1.39f, 0f, -2.6f, 0.82f, -3.16f, 2f)
                horizontalLineToRelative(-2.68f)
                curveToRelative(-0.5f, -1.04f, -1.5f, -1.8f, -2.68f, -1.97f)
                lineToRelative(-0.44f, -0.67f)
                curveToRelative(-0.1f, -0.17f, -0.34f, -0.69f, -0.67f, -1.36f)
                horizontalLineToRelative(11.29f)
                curveToRelative(-0.21f, 0.59f, -0.52f, 1.15f, -0.92f, 1.66f)
                close()
            }
        }.build()
        
        return _Child_friendly!!
    }

private var _Child_friendly: ImageVector? = null

