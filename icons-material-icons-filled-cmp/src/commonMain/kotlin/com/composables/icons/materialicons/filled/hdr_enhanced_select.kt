package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hdr_enhanced_select: ImageVector
    get() {
        if (_Hdr_enhanced_select != null) return _Hdr_enhanced_select!!
        
        _Hdr_enhanced_select = ImageVector.Builder(
            name = "hdr_enhanced_select",
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
                moveTo(12f, 2f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                close()
                moveToRelative(0f, 2f)
                curveTo(9.79f, 4f, 8f, 5.79f, 8f, 8f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveToRelative(1f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(11f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(20f)
                close()
                moveToRelative(-6f, -1.5f)
                curveToRelative(0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                lineTo(18f, 22f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.9f, -2f)
                horizontalLineToRelative(-1.1f)
                verticalLineToRelative(2f)
                horizontalLineTo(13f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.8f, 0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(-1.5f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(-13f, -0.5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(22f)
                horizontalLineTo(0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(6.5f, -2f)
                curveToRelative(0.8f, 0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-6f)
                horizontalLineTo(10f)
                close()
                moveToRelative(0f, 4.5f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Hdr_enhanced_select!!
    }

private var _Hdr_enhanced_select: ImageVector? = null

