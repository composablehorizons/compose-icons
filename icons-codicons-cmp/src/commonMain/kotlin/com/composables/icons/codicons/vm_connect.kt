package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VmConnect: ImageVector
    get() {
        if (_VmConnect != null) return _VmConnect!!
        
        _VmConnect = ImageVector.Builder(
            name = "vm-connect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.607f, 14f)
                curveTo(6.79f, 14.357f, 7.007f, 14.693f, 7.261f, 15f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 15f, 3f, 14.776f, 3f, 14.5f)
                curveTo(3f, 14.224f, 3.224f, 14f, 3.5f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                curveTo(1.895f, 12f, 1f, 11.105f, 1f, 10f)
                verticalLineTo(3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(13f)
                curveTo(14.105f, 1f, 15f, 1.895f, 15f, 3f)
                verticalLineTo(7.261f)
                curveTo(14.693f, 7.008f, 14.357f, 6.791f, 14f, 6.607f)
                verticalLineTo(3f)
                curveTo(14f, 2.448f, 13.552f, 2f, 13f, 2f)
                horizontalLineTo(3f)
                curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
                verticalLineTo(10f)
                curveTo(2f, 10.552f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(6.025f)
                curveTo(6.01f, 11.165f, 6f, 11.331f, 6f, 11.5f)
                curveTo(6f, 11.669f, 6.01f, 11.835f, 6.025f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(6.607f)
                close()
                moveTo(16f, 11.5f)
                curveTo(16f, 13.985f, 13.985f, 16f, 11.5f, 16f)
                curveTo(9.015f, 16f, 7f, 13.985f, 7f, 11.5f)
                curveTo(7f, 9.015f, 9.015f, 7f, 11.5f, 7f)
                curveTo(13.985f, 7f, 16f, 9.015f, 16f, 11.5f)
                close()
                moveTo(11.501f, 12.5f)
                curveTo(11.501f, 12.434f, 11.488f, 12.369f, 11.463f, 12.308f)
                curveTo(11.438f, 12.247f, 11.401f, 12.192f, 11.354f, 12.146f)
                lineTo(9.854f, 10.646f)
                curveTo(9.76f, 10.552f, 9.633f, 10.499f, 9.5f, 10.499f)
                curveTo(9.367f, 10.499f, 9.24f, 10.552f, 9.146f, 10.646f)
                curveTo(9.052f, 10.74f, 8.999f, 10.867f, 8.999f, 11f)
                curveTo(8.999f, 11.133f, 9.052f, 11.26f, 9.146f, 11.354f)
                lineTo(10.293f, 12.5f)
                lineTo(9.146f, 13.646f)
                curveTo(9.052f, 13.74f, 8.999f, 13.867f, 8.999f, 14f)
                curveTo(8.999f, 14.133f, 9.052f, 14.26f, 9.146f, 14.354f)
                curveTo(9.24f, 14.448f, 9.367f, 14.501f, 9.5f, 14.501f)
                curveTo(9.633f, 14.501f, 9.76f, 14.448f, 9.854f, 14.354f)
                lineTo(11.354f, 12.854f)
                curveTo(11.401f, 12.808f, 11.437f, 12.752f, 11.463f, 12.692f)
                curveTo(11.488f, 12.631f, 11.501f, 12.566f, 11.501f, 12.5f)
                close()
                moveTo(12.707f, 10.5f)
                lineTo(13.854f, 9.354f)
                curveTo(13.948f, 9.26f, 14.001f, 9.133f, 14.001f, 9f)
                curveTo(14.001f, 8.867f, 13.948f, 8.74f, 13.854f, 8.646f)
                curveTo(13.76f, 8.552f, 13.633f, 8.499f, 13.5f, 8.499f)
                curveTo(13.367f, 8.499f, 13.24f, 8.552f, 13.146f, 8.646f)
                lineTo(11.646f, 10.146f)
                curveTo(11.599f, 10.192f, 11.563f, 10.248f, 11.537f, 10.308f)
                curveTo(11.512f, 10.369f, 11.499f, 10.434f, 11.499f, 10.5f)
                curveTo(11.499f, 10.566f, 11.512f, 10.631f, 11.537f, 10.692f)
                curveTo(11.562f, 10.753f, 11.599f, 10.808f, 11.646f, 10.854f)
                lineTo(13.146f, 12.354f)
                curveTo(13.24f, 12.448f, 13.367f, 12.501f, 13.5f, 12.501f)
                curveTo(13.633f, 12.501f, 13.76f, 12.448f, 13.854f, 12.354f)
                curveTo(13.948f, 12.26f, 14.001f, 12.133f, 14.001f, 12f)
                curveTo(14.001f, 11.867f, 13.948f, 11.74f, 13.854f, 11.646f)
                lineTo(12.707f, 10.5f)
                close()
            }
        }.build()
        
        return _VmConnect!!
    }

private var _VmConnect: ImageVector? = null

