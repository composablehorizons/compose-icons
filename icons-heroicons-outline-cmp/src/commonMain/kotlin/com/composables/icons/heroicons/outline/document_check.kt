package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DocumentCheck: ImageVector
    get() {
        if (_DocumentCheck != null) return _DocumentCheck!!
        
        _DocumentCheck = ImageVector.Builder(
            name = "document-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(10.125f, 2.25f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(12.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineToRelative(-9f)
                moveTo(10.125f, 2.25f)
                horizontalLineToRelative(0.375f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
                verticalLineToRelative(0.375f)
                moveTo(10.125f, 2.25f)
                arcTo(3.375f, 3.375f, 0f, false, true, 13.5f, 5.625f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(1.5f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, 3.375f, 3.375f)
                moveTo(9f, 15f)
                lineToRelative(2.25f, 2.25f)
                lineTo(15f, 12f)
            }
        }.build()
        
        return _DocumentCheck!!
    }

private var _DocumentCheck: ImageVector? = null

