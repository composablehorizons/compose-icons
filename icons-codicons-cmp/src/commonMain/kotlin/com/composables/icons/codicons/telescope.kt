package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Telescope: ImageVector
    get() {
        if (_Telescope != null) return _Telescope!!
        
        _Telescope = ImageVector.Builder(
            name = "telescope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.447f, 6.276f)
                lineTo(11.947f, 1.276f)
                curveTo(11.823f, 1.029f, 11.523f, 0.928002f, 11.276f, 1.052f)
                lineTo(8.27598f, 2.552f)
                curveTo(8.02898f, 2.676f, 7.92898f, 2.976f, 8.05198f, 3.223f)
                lineTo(8.07798f, 3.276f)
                lineTo(4.52498f, 5.052f)
                curveTo(4.27798f, 5.176f, 4.17798f, 5.476f, 4.30098f, 5.723f)
                lineTo(4.57698f, 6.276f)
                lineTo(2.02398f, 7.552f)
                curveTo(1.77698f, 7.676f, 1.67698f, 7.976f, 1.79998f, 8.223f)
                lineTo(2.79998f, 10.223f)
                curveTo(2.88798f, 10.398f, 3.06498f, 10.499f, 3.24698f, 10.499f)
                curveTo(3.32198f, 10.499f, 3.39798f, 10.482f, 3.47098f, 10.446f)
                lineTo(6.02398f, 9.17f)
                lineTo(6.29998f, 9.723f)
                curveTo(6.34598f, 9.814f, 6.41698f, 9.883f, 6.49898f, 9.93f)
                lineTo(4.56498f, 13.248f)
                curveTo(4.42498f, 13.486f, 4.50598f, 13.793f, 4.74498f, 13.932f)
                curveTo(4.82398f, 13.979f, 4.91098f, 14f, 4.99698f, 14f)
                curveTo(5.16898f, 14f, 5.33598f, 13.911f, 5.42898f, 13.752f)
                lineTo(7.92398f, 9.471f)
                lineTo(7.99698f, 9.434f)
                verticalLineTo(14.5f)
                curveTo(7.99698f, 14.776f, 8.22098f, 15f, 8.49698f, 15f)
                curveTo(8.77298f, 15f, 8.99698f, 14.776f, 8.99698f, 14.5f)
                verticalLineTo(9.346f)
                lineTo(11.565f, 13.752f)
                curveTo(11.658f, 13.911f, 11.825f, 14f, 11.997f, 14f)
                curveTo(12.083f, 14f, 12.17f, 13.979f, 12.249f, 13.932f)
                curveTo(12.487f, 13.793f, 12.568f, 13.487f, 12.429f, 13.248f)
                lineTo(9.70698f, 8.579f)
                lineTo(10.523f, 8.171f)
                lineTo(10.549f, 8.224f)
                curveTo(10.637f, 8.399f, 10.814f, 8.5f, 10.996f, 8.5f)
                curveTo(11.071f, 8.5f, 11.147f, 8.483f, 11.22f, 8.447f)
                lineTo(14.22f, 6.947f)
                curveTo(14.467f, 6.823f, 14.567f, 6.523f, 14.444f, 6.276f)
                horizontalLineTo(14.447f)
                close()
                moveTo(3.47398f, 9.329f)
                lineTo(2.92098f, 8.224f)
                lineTo(5.02598f, 7.171f)
                lineTo(5.57898f, 8.276f)
                lineTo(3.47398f, 9.329f)
                close()
                moveTo(6.97398f, 8.829f)
                lineTo(5.42098f, 5.724f)
                lineTo(8.52598f, 4.171f)
                lineTo(10.079f, 7.276f)
                lineTo(6.97398f, 8.829f)
                close()
                moveTo(11.224f, 7.329f)
                lineTo(9.17098f, 3.224f)
                lineTo(11.276f, 2.171f)
                lineTo(13.329f, 6.276f)
                lineTo(11.224f, 7.329f)
                close()
            }
        }.build()
        
        return _Telescope!!
    }

private var _Telescope: ImageVector? = null

