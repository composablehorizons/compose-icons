package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Unarchive: ImageVector
    get() {
        if (_Unarchive != null) return _Unarchive!!
        
        _Unarchive = ImageVector.Builder(
            name = "unarchive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 13f)
                curveTo(3.673f, 13f, 3f, 12.327f, 3f, 11.5f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(6.213f)
                curveTo(13.349f, 6.312f, 13.683f, 6.444f, 14f, 6.607f)
                verticalLineTo(6f)
                curveTo(14f, 5.971f, 13.999f, 5.943f, 13.996f, 5.915f)
                curveTo(14.58f, 5.71f, 15f, 5.153f, 15f, 4.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.673f, 14.327f, 2f, 13.5f, 2f)
                horizontalLineTo(2.5f)
                curveTo(1.673f, 2f, 1f, 2.673f, 1f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(1f, 5.153f, 1.42f, 5.71f, 2.004f, 5.915f)
                curveTo(2.002f, 5.943f, 2f, 5.971f, 2f, 6f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.878f, 3.122f, 14f, 4.5f, 14f)
                horizontalLineTo(6.607f)
                curveTo(6.444f, 13.683f, 6.312f, 13.349f, 6.213f, 13f)
                horizontalLineTo(4.5f)
                close()
                moveTo(2.5f, 5f)
                curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 3f, 14f, 3.224f, 14f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 4.776f, 13.776f, 5f, 13.5f, 5f)
                horizontalLineTo(2.5f)
                close()
                moveTo(11.5f, 7f)
                curveTo(9.015f, 7f, 7f, 9.015f, 7f, 11.5f)
                curveTo(7f, 13.985f, 9.015f, 16f, 11.5f, 16f)
                curveTo(13.985f, 16f, 16f, 13.985f, 16f, 11.5f)
                curveTo(16f, 9.015f, 13.985f, 7f, 11.5f, 7f)
                close()
                moveTo(13.836f, 12.871f)
                lineTo(11.854f, 14.853f)
                curveTo(11.756f, 14.951f, 11.628f, 14.999f, 11.5f, 14.999f)
                curveTo(11.372f, 14.999f, 11.244f, 14.95f, 11.146f, 14.853f)
                curveTo(10.951f, 14.658f, 10.951f, 14.341f, 11.146f, 14.146f)
                lineTo(13.128f, 12.164f)
                curveTo(13.367f, 11.925f, 13.499f, 11.606f, 13.499f, 11.268f)
                curveTo(13.499f, 10.569f, 12.93f, 10f, 12.231f, 10f)
                curveTo(11.892f, 10f, 11.574f, 10.132f, 11.335f, 10.371f)
                lineTo(10.706f, 11f)
                horizontalLineTo(11.499f)
                curveTo(11.775f, 11f, 11.999f, 11.224f, 11.999f, 11.5f)
                curveTo(11.999f, 11.776f, 11.775f, 12f, 11.499f, 12f)
                horizontalLineTo(9.499f)
                curveTo(9.223f, 12f, 8.999f, 11.776f, 8.999f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(8.999f, 9.224f, 9.223f, 9f, 9.499f, 9f)
                curveTo(9.775f, 9f, 9.999f, 9.224f, 9.999f, 9.5f)
                verticalLineTo(10.293f)
                lineTo(10.628f, 9.664f)
                curveTo(11.056f, 9.236f, 11.626f, 9f, 12.232f, 9f)
                curveTo(13.482f, 9f, 14.5f, 10.017f, 14.5f, 11.268f)
                curveTo(14.5f, 11.874f, 14.264f, 12.442f, 13.836f, 12.871f)
                close()
            }
        }.build()
        
        return _Unarchive!!
    }

private var _Unarchive: ImageVector? = null

