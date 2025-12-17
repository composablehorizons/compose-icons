package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Wrench: ImageVector
    get() {
        if (_Wrench != null) return _Wrench!!
        
        _Wrench = ImageVector.Builder(
            name = "wrench",
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
                moveTo(21.75f, 6.75f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -4.884f, 4.484f)
                curveToRelative(-1.076f, -0.091f, -2.264f, 0.071f, -2.95f, 0.904f)
                lineToRelative(-7.152f, 8.684f)
                arcToRelative(2.548f, 2.548f, 0f, true, true, -3.586f, -3.586f)
                lineToRelative(8.684f, -7.152f)
                curveToRelative(0.833f, -0.686f, 0.995f, -1.874f, 0.904f, -2.95f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 6.336f, -4.486f)
                lineToRelative(-3.276f, 3.276f)
                arcToRelative(3.004f, 3.004f, 0f, false, false, 2.25f, 2.25f)
                lineToRelative(3.276f, -3.276f)
                curveToRelative(0.256f, 0.565f, 0.398f, 1.192f, 0.398f, 1.852f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(4.867f, 19.125f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _Wrench!!
    }

private var _Wrench: ImageVector? = null

