package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.QuestionMarkCircle: ImageVector
    get() {
        if (_QuestionMarkCircle != null) return _QuestionMarkCircle!!
        
        _QuestionMarkCircle = ImageVector.Builder(
            name = "question-mark-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                close()
                moveTo(8.94f, 6.94f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.061f, -1.061f)
                arcToRelative(3f, 3f, 0f, true, true, 2.871f, 5.026f)
                verticalLineToRelative(0.345f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.72f, 0.57f, -1.172f, 1.081f, -1.287f)
                arcTo(1.5f, 1.5f, 0f, true, false, 8.94f, 6.94f)
                close()
                moveTo(10f, 15f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _QuestionMarkCircle!!
    }

private var _QuestionMarkCircle: ImageVector? = null

