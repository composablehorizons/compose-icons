package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ShieldCheck: ImageVector
    get() {
        if (_ShieldCheck != null) return _ShieldCheck!!
        
        _ShieldCheck = ImageVector.Builder(
            name = "shield-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(9f, 12.75f)
                lineTo(11.25f, 15f)
                lineTo(15f, 9.75f)
                moveToRelative(-3f, -7.036f)
                arcTo(11.959f, 11.959f, 0f, false, true, 3.598f, 6f)
                arcTo(11.99f, 11.99f, 0f, false, false, 3f, 9.749f)
                curveToRelative(0f, 5.592f, 3.824f, 10.29f, 9f, 11.623f)
                curveToRelative(5.176f, -1.332f, 9f, -6.03f, 9f, -11.622f)
                curveToRelative(0f, -1.31f, -0.21f, -2.571f, -0.598f, -3.751f)
                horizontalLineToRelative(-0.152f)
                curveToRelative(-3.196f, 0f, -6.1f, -1.248f, -8.25f, -3.285f)
                close()
            }
        }.build()
        
        return _ShieldCheck!!
    }

private var _ShieldCheck: ImageVector? = null

