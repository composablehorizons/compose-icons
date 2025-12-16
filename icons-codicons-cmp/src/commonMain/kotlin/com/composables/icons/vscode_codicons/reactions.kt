package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Reactions: ImageVector
    get() {
        if (_Reactions != null) return _Reactions!!
        
        _Reactions = ImageVector.Builder(
            name = "reactions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 7f)
                curveTo(13f, 3.68629f, 10.3137f, 1f, 7f, 1f)
                curveTo(3.68629f, 1f, 1f, 3.68629f, 1f, 7f)
                curveTo(1f, 10.3137f, 3.68629f, 13f, 7f, 13f)
                curveTo(7.08516f, 13f, 7.1699f, 12.9982f, 7.25419f, 12.9947f)
                curveTo(7.14265f, 12.6779f, 7.06557f, 12.3448f, 7.02746f, 11.9999f)
                lineTo(7f, 12f)
                curveTo(4.23858f, 12f, 2f, 9.76142f, 2f, 7f)
                curveTo(2f, 4.23858f, 4.23858f, 2f, 7f, 2f)
                curveTo(9.76142f, 2f, 12f, 4.23858f, 12f, 7f)
                lineTo(11.9999f, 7.02746f)
                curveTo(12.3448f, 7.06557f, 12.6779f, 7.14265f, 12.9947f, 7.25419f)
                curveTo(12.9982f, 7.1699f, 13f, 7.08516f, 13f, 7f)
                close()
                moveTo(7.11191f, 10.4982f)
                curveTo(7.19558f, 10.1302f, 7.32437f, 9.77927f, 7.49216f, 9.45163f)
                curveTo(7.33305f, 9.48337f, 7.16848f, 9.5f, 7f, 9.5f)
                curveTo(6.25963f, 9.5f, 5.59494f, 9.1788f, 5.13646f, 8.66654f)
                curveTo(4.95229f, 8.46078f, 4.6362f, 8.44327f, 4.43043f, 8.62743f)
                curveTo(4.22467f, 8.8116f, 4.20716f, 9.12769f, 4.39132f, 9.33346f)
                curveTo(5.03148f, 10.0487f, 5.96337f, 10.5f, 7f, 10.5f)
                curveTo(7.03744f, 10.5f, 7.07475f, 10.4994f, 7.11191f, 10.4982f)
                close()
                moveTo(6f, 6f)
                curveTo(6f, 6.41421f, 5.66421f, 6.75f, 5.25f, 6.75f)
                curveTo(4.83579f, 6.75f, 4.5f, 6.41421f, 4.5f, 6f)
                curveTo(4.5f, 5.58579f, 4.83579f, 5.25f, 5.25f, 5.25f)
                curveTo(5.66421f, 5.25f, 6f, 5.58579f, 6f, 6f)
                close()
                moveTo(8.75f, 6.75f)
                curveTo(9.16421f, 6.75f, 9.5f, 6.41421f, 9.5f, 6f)
                curveTo(9.5f, 5.58579f, 9.16421f, 5.25f, 8.75f, 5.25f)
                curveTo(8.33579f, 5.25f, 8f, 5.58579f, 8f, 6f)
                curveTo(8f, 6.41421f, 8.33579f, 6.75f, 8.75f, 6.75f)
                close()
                moveTo(15f, 11.5f)
                curveTo(15f, 13.433f, 13.433f, 15f, 11.5f, 15f)
                curveTo(9.567f, 15f, 8f, 13.433f, 8f, 11.5f)
                curveTo(8f, 9.567f, 9.567f, 8f, 11.5f, 8f)
                curveTo(13.433f, 8f, 15f, 9.567f, 15f, 11.5f)
                close()
                moveTo(12f, 9.5f)
                curveTo(12f, 9.22386f, 11.7761f, 9f, 11.5f, 9f)
                curveTo(11.2239f, 9f, 11f, 9.22386f, 11f, 9.5f)
                verticalLineTo(11f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 11f, 9f, 11.2239f, 9f, 11.5f)
                curveTo(9f, 11.7761f, 9.22386f, 12f, 9.5f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(13.5f)
                curveTo(11f, 13.7761f, 11.2239f, 14f, 11.5f, 14f)
                curveTo(11.7761f, 14f, 12f, 13.7761f, 12f, 13.5f)
                verticalLineTo(12f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 12f, 14f, 11.7761f, 14f, 11.5f)
                curveTo(14f, 11.2239f, 13.7761f, 11f, 13.5f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()
        
        return _Reactions!!
    }

private var _Reactions: ImageVector? = null

