package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Swatch: ImageVector
    get() {
        if (_Swatch != null) return _Swatch!!
        
        _Swatch = ImageVector.Builder(
            name = "swatch",
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
                moveTo(4.098f, 19.902f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 5.304f, 0f)
                lineToRelative(6.401f, -6.402f)
                moveTo(6.75f, 21f)
                arcTo(3.75f, 3.75f, 0f, false, true, 3f, 17.25f)
                verticalLineTo(4.125f)
                curveTo(3f, 3.504f, 3.504f, 3f, 4.125f, 3f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(4.072f)
                moveTo(6.75f, 21f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 3.75f, -3.75f)
                verticalLineTo(8.197f)
                moveTo(6.75f, 21f)
                horizontalLineToRelative(13.125f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineToRelative(-4.072f)
                moveTo(10.5f, 8.197f)
                lineToRelative(2.88f, -2.88f)
                curveToRelative(0.438f, -0.439f, 1.15f, -0.439f, 1.59f, 0f)
                lineToRelative(3.712f, 3.713f)
                curveToRelative(0.44f, 0.44f, 0.44f, 1.152f, 0f, 1.59f)
                lineToRelative(-2.879f, 2.88f)
                moveTo(6.75f, 17.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(6.75f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _Swatch!!
    }

private var _Swatch: ImageVector? = null

