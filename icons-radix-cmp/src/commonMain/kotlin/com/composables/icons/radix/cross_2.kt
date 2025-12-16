package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Cross2: ImageVector
    get() {
        if (_Cross2 != null) return _Cross2!!
        
        _Cross2 = ImageVector.Builder(
            name = "cross-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.9688f, 3.21871f)
                curveTo(11.1933f, 2.99416f, 11.5567f, 2.99416f, 11.7813f, 3.21871f)
                curveTo(12.0056f, 3.44328f, 12.0057f, 3.80673f, 11.7813f, 4.03121f)
                lineTo(8.31251f, 7.49996f)
                lineTo(11.7813f, 10.9687f)
                lineTo(11.8555f, 11.0586f)
                curveTo(12.0026f, 11.2817f, 11.9777f, 11.5848f, 11.7813f, 11.7812f)
                curveTo(11.5849f, 11.9776f, 11.2818f, 12.0026f, 11.0586f, 11.8554f)
                lineTo(10.9688f, 11.7812f)
                lineTo(7.50001f, 8.31246f)
                lineTo(4.03126f, 11.7812f)
                curveTo(3.80677f, 12.0057f, 3.44332f, 12.0056f, 3.21876f, 11.7812f)
                curveTo(2.99421f, 11.5567f, 2.99421f, 11.1933f, 3.21876f, 10.9687f)
                lineTo(6.68751f, 7.49996f)
                lineTo(3.21876f, 4.03121f)
                lineTo(3.14454f, 3.94137f)
                curveTo(2.99723f, 3.71819f, 3.0223f, 3.41517f, 3.21876f, 3.21871f)
                curveTo(3.41522f, 3.02225f, 3.71823f, 2.99719f, 3.94141f, 3.14449f)
                lineTo(4.03126f, 3.21871f)
                lineTo(7.50001f, 6.68746f)
                lineTo(10.9688f, 3.21871f)
                close()
            }
        }.build()
        
        return _Cross2!!
    }

private var _Cross2: ImageVector? = null

