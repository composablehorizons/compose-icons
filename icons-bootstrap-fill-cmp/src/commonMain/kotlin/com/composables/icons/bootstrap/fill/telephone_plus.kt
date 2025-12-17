package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.TelephonePlus: ImageVector
    get() {
        if (_TelephonePlus != null) return _TelephonePlus!!
        
        _TelephonePlus = ImageVector.Builder(
            name = "telephone-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.885f, 0.511f)
                arcToRelative(1.745f, 1.745f, 0f, false, true, 2.61f, 0.163f)
                lineTo(6.29f, 2.98f)
                curveToRelative(0.329f, 0.423f, 0.445f, 0.974f, 0.315f, 1.494f)
                lineToRelative(-0.547f, 2.19f)
                arcToRelative(0.68f, 0.68f, 0f, false, false, 0.178f, 0.643f)
                lineToRelative(2.457f, 2.457f)
                arcToRelative(0.68f, 0.68f, 0f, false, false, 0.644f, 0.178f)
                lineToRelative(2.189f, -0.547f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, 1.494f, 0.315f)
                lineToRelative(2.306f, 1.794f)
                curveToRelative(0.829f, 0.645f, 0.905f, 1.87f, 0.163f, 2.611f)
                lineToRelative(-1.034f, 1.034f)
                curveToRelative(-0.74f, 0.74f, -1.846f, 1.065f, -2.877f, 0.702f)
                arcToRelative(18.6f, 18.6f, 0f, false, true, -7.01f, -4.42f)
                arcToRelative(18.6f, 18.6f, 0f, false, true, -4.42f, -7.009f)
                curveToRelative(-0.362f, -1.03f, -0.037f, -2.137f, 0.703f, -2.877f)
                close()
                moveTo(12.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(4f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(12f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _TelephonePlus!!
    }

private var _TelephonePlus: ImageVector? = null

