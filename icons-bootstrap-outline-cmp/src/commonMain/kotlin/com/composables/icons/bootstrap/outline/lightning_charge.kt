package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.LightningCharge: ImageVector
    get() {
        if (_LightningCharge != null) return _LightningCharge!!
        
        _LightningCharge = ImageVector.Builder(
            name = "lightning-charge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.251f, 0.068f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.227f, 0.58f)
                lineTo(9.677f, 6.5f)
                horizontalLineTo(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.364f, 0.843f)
                lineToRelative(-8f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.842f, -0.49f)
                lineTo(6.323f, 9.5f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.364f, -0.843f)
                lineToRelative(8f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.615f, -0.09f)
                close()
                moveTo(4.157f, 8.5f)
                horizontalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.478f, 0.647f)
                lineTo(6.11f, 13.59f)
                lineToRelative(5.732f, -6.09f)
                horizontalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.478f, -0.647f)
                lineTo(9.89f, 2.41f)
                close()
            }
        }.build()
        
        return _LightningCharge!!
    }

private var _LightningCharge: ImageVector? = null

