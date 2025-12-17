package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Sistrix: ImageVector
    get() {
        if (_Sistrix != null) return _Sistrix!!
        
        _Sistrix = ImageVector.Builder(
            name = "sistrix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 449f)
                lineTo(301.2f, 300.2f)
                curveToRelative(20f, -27.9f, 31.9f, -62.2f, 31.9f, -99.2f)
                curveToRelative(0f, -93.1f, -74.7f, -168.9f, -166.5f, -168.9f)
                curveTo(74.7f, 32f, 0f, 107.8f, 0f, 200.9f)
                reflectiveCurveToRelative(74.7f, 168.9f, 166.5f, 168.9f)
                curveToRelative(39.8f, 0f, 76.3f, -14.2f, 105f, -37.9f)
                lineToRelative(146f, 148.1f)
                lineToRelative(30.5f, -31f)
                close()
                moveTo(166.5f, 330.8f)
                curveToRelative(-70.6f, 0f, -128.1f, -58.3f, -128.1f, -129.9f)
                reflectiveCurveTo(95.9f, 71f, 166.5f, 71f)
                reflectiveCurveToRelative(128.1f, 58.3f, 128.1f, 129.9f)
                reflectiveCurveToRelative(-57.4f, 129.9f, -128.1f, 129.9f)
                close()
            }
        }.build()
        
        return _Sistrix!!
    }

private var _Sistrix: ImageVector? = null

