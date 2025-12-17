package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hdr_on: ImageVector
    get() {
        if (_Hdr_on != null) return _Hdr_on!!
        
        _Hdr_on = ImageVector.Builder(
            name = "hdr_on",
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
                moveTo(7.25f, 9f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineTo(11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9.75f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveTo(3f, 9.34f, 3f, 9.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                curveTo(8f, 9.34f, 7.66f, 9f, 7.25f, 9f)
                close()
                moveTo(21f, 11.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.25f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(13f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.72f, 1.59f)
                curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f)
                curveToRelative(0.5f, 0f, 0.83f, -0.51f, 0.64f, -0.96f)
                lineToRelative(-0.49f, -1.14f)
                curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                close()
                moveToRelative(-3.5f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.82f, 0f, 1.5f, -0.68f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f)
                close()
                moveToRelative(0f, 4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Hdr_on!!
    }

private var _Hdr_on: ImageVector? = null

