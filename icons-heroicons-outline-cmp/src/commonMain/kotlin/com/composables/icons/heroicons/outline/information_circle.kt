package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.InformationCircle: ImageVector
    get() {
        if (_InformationCircle != null) return _InformationCircle!!
        
        _InformationCircle = ImageVector.Builder(
            name = "information-circle",
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
                moveTo(11.25f, 11.25f)
                lineToRelative(0.041f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.063f, 0.852f)
                lineToRelative(-0.708f, 2.836f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.063f, 0.853f)
                lineToRelative(0.041f, -0.021f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
                moveToRelative(-9f, -3.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineTo(8.25f)
                close()
            }
        }.build()
        
        return _InformationCircle!!
    }

private var _InformationCircle: ImageVector? = null

