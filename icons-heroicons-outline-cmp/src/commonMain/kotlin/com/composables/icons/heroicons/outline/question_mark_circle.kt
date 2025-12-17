package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.QuestionMarkCircle: ImageVector
    get() {
        if (_QuestionMarkCircle != null) return _QuestionMarkCircle!!
        
        _QuestionMarkCircle = ImageVector.Builder(
            name = "question-mark-circle",
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
                moveTo(9.879f, 7.519f)
                curveToRelative(1.171f, -1.025f, 3.071f, -1.025f, 4.242f, 0f)
                curveToRelative(1.172f, 1.025f, 1.172f, 2.687f, 0f, 3.712f)
                curveToRelative(-0.203f, 0.179f, -0.43f, 0.326f, -0.67f, 0.442f)
                curveToRelative(-0.745f, 0.361f, -1.45f, 0.999f, -1.45f, 1.827f)
                verticalLineToRelative(0.75f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
                moveToRelative(-9f, 5.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _QuestionMarkCircle!!
    }

private var _QuestionMarkCircle: ImageVector? = null

