package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Roofing: ImageVector
    get() {
        if (_Roofing != null) return _Roofing!!
        
        _Roofing = ImageVector.Builder(
            name = "roofing",
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
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(18f)
                close()
                moveTo(9f, 15f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveTo(9.45f, 14f, 9f, 14.45f, 9f, 15f)
                close()
                moveTo(19f, 9.3f)
                lineTo(19f, 9.3f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.6f)
                verticalLineToRelative(0f)
                lineToRelative(-3.33f, -3f)
                curveToRelative(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0f)
                lineToRelative(-8.36f, 7.53f)
                curveTo(2.63f, 11.43f, 2.84f, 12f, 3.3f, 12f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.25f, 0f, 0.49f, -0.09f, 0.67f, -0.26f)
                lineTo(12f, 5.69f)
                lineToRelative(6.71f, 6.05f)
                curveTo(18.9f, 11.91f, 19.14f, 12f, 19.38f, 12f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.46f, 0f, 0.68f, -0.57f, 0.33f, -0.87f)
                lineTo(19f, 9.3f)
                close()
            }
        }.build()
        
        return _Roofing!!
    }

private var _Roofing: ImageVector? = null

