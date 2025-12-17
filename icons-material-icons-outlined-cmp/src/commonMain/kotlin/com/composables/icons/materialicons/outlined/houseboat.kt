package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Houseboat: ImageVector
    get() {
        if (_Houseboat != null) return _Houseboat!!
        
        _Houseboat = ImageVector.Builder(
            name = "houseboat",
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
                moveTo(12f, 16f)
                curveToRelative(-1.95f, 0f, -2.1f, 1f, -3.34f, 1f)
                curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                curveTo(3.38f, 16f, 3.24f, 17f, 2f, 17f)
                verticalLineToRelative(2f)
                curveToRelative(1.9f, 0f, 2.17f, -1f, 3.35f, -1f)
                curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                curveToRelative(1.95f, 0f, 2.08f, -1f, 3.32f, -1f)
                reflectiveCurveToRelative(1.37f, 1f, 3.32f, 1f)
                curveToRelative(1.91f, 0f, 2.14f, -1f, 3.33f, -1f)
                curveToRelative(1.18f, 0f, 1.45f, 1f, 3.35f, 1f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.24f, 0f, -1.38f, -1f, -3.33f, -1f)
                curveToRelative(-1.91f, 0f, -2.14f, 1f, -3.33f, 1f)
                curveTo(14.1f, 17f, 13.95f, 16f, 12f, 16f)
                close()
                moveTo(20.34f, 11.34f)
                lineToRelative(-1.37f, 1.37f)
                curveTo(18.78f, 12.89f, 18.52f, 13f, 18.26f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(9.65f)
                lineToRelative(1.32f, 0.97f)
                lineTo(19.5f, 9f)
                lineTo(12f, 3.5f)
                lineTo(4.5f, 9f)
                lineToRelative(1.18f, 1.61f)
                lineTo(7f, 9.65f)
                verticalLineTo(13f)
                horizontalLineTo(5.74f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-1.37f, -1.37f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.37f, 1.37f)
                curveTo(4.18f, 14.68f, 4.95f, 15f, 5.74f, 15f)
                horizontalLineToRelative(12.51f)
                curveToRelative(0.8f, 0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(1.37f, -1.37f)
                lineTo(20.34f, 11.34f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(8.18f)
                lineToRelative(3f, -2.2f)
                lineToRelative(3f, 2.2f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                close()
            }
        }.build()
        
        return _Houseboat!!
    }

private var _Houseboat: ImageVector? = null

