package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ExternalLink: ImageVector
    get() {
        if (_ExternalLink != null) return _ExternalLink!!
        
        _ExternalLink = ImageVector.Builder(
            name = "external-link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 2f)
                curveTo(6.77614f, 2f, 7f, 2.22386f, 7f, 2.5f)
                curveTo(7f, 2.77614f, 6.77614f, 3f, 6.5f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(8.5f)
                curveTo(12f, 8.22386f, 12.2239f, 8f, 12.5f, 8f)
                curveTo(12.7761f, 8f, 13f, 8.22386f, 13f, 8.5f)
                verticalLineTo(12f)
                curveTo(13f, 12.5523f, 12.5523f, 13f, 12f, 13f)
                horizontalLineTo(3f)
                curveTo(2.44772f, 13f, 2f, 12.5523f, 2f, 12f)
                verticalLineTo(3f)
                curveTo(2f, 2.44772f, 2.44772f, 2f, 3f, 2f)
                horizontalLineTo(6.5f)
                close()
                moveTo(12.5f, 2f)
                curveTo(12.5327f, 2f, 12.5655f, 2.00242f, 12.5977f, 2.00879f)
                lineTo(12.6006f, 2.00977f)
                curveTo(12.6596f, 2.02181f, 12.7142f, 2.04529f, 12.7637f, 2.07617f)
                curveTo(12.7759f, 2.08379f, 12.7872f, 2.09279f, 12.7988f, 2.10156f)
                curveTo(12.8133f, 2.11247f, 12.8276f, 2.12336f, 12.8408f, 2.13574f)
                curveTo(12.8448f, 2.13951f, 12.8496f, 2.14255f, 12.8535f, 2.14648f)
                curveTo(12.8579f, 2.15091f, 12.861f, 2.15658f, 12.8652f, 2.16113f)
                curveTo(12.8782f, 2.17509f, 12.8901f, 2.18971f, 12.9014f, 2.20508f)
                curveTo(12.9096f, 2.21632f, 12.9176f, 2.22752f, 12.9248f, 2.23926f)
                curveTo(12.9352f, 2.25615f, 12.9438f, 2.27385f, 12.9521f, 2.29199f)
                curveTo(12.9559f, 2.30024f, 12.9605f, 2.30801f, 12.9639f, 2.31641f)
                curveTo(12.9719f, 2.33664f, 12.9781f, 2.35748f, 12.9834f, 2.37891f)
                curveTo(12.9859f, 2.38905f, 12.9893f, 2.39893f, 12.9912f, 2.40918f)
                curveTo(12.9966f, 2.43867f, 13f, 2.46896f, 13f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(13f, 5.77614f, 12.7761f, 6f, 12.5f, 6f)
                curveTo(12.2239f, 6f, 12f, 5.77614f, 12f, 5.5f)
                verticalLineTo(3.70703f)
                lineTo(6.85352f, 8.85352f)
                curveTo(6.65825f, 9.04878f, 6.34175f, 9.04878f, 6.14648f, 8.85352f)
                curveTo(5.95122f, 8.65825f, 5.95122f, 8.34175f, 6.14648f, 8.14648f)
                lineTo(11.293f, 3f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 3f, 9f, 2.77614f, 9f, 2.5f)
                curveTo(9f, 2.22386f, 9.22386f, 2f, 9.5f, 2f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _ExternalLink!!
    }

private var _ExternalLink: ImageVector? = null

