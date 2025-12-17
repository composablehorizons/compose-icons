package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Industry: ImageVector
    get() {
        if (_Industry != null) return _Industry!!
        
        _Industry = ImageVector.Builder(
            name = "industry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(475.115f, 163.781f)
                lineTo(336f, 252.309f)
                verticalLineToRelative(-68.28f)
                curveToRelative(0f, -18.916f, -20.931f, -30.399f, -36.885f, -20.248f)
                lineTo(160f, 252.309f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveTo(10.745f, 32f, 0f, 42.745f, 0f, 56f)
                verticalLineToRelative(400f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(464f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(184.029f)
                curveToRelative(0f, -18.917f, -20.931f, -30.399f, -36.885f, -20.248f)
                close()
            }
        }.build()
        
        return _Industry!!
    }

private var _Industry: ImageVector? = null

