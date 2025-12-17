package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.QuestionMarkCircle: ImageVector
    get() {
        if (_QuestionMarkCircle != null) return _QuestionMarkCircle!!
        
        _QuestionMarkCircle = ImageVector.Builder(
            name = "question-mark-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcTo(7f, 7f, 0f, true, true, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
                close()
                moveToRelative(-6f, 3.5f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveTo(7.293f, 5.293f)
                arcToRelative(1f, 1f, 0f, true, true, 0.99f, 1.667f)
                curveToRelative(-0.459f, 0.134f, -1.033f, 0.566f, -1.033f, 1.29f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.5f, 0f)
                verticalLineToRelative(-0.115f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -2.518f, -4.153f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.061f, 1.06f)
                close()
            }
        }.build()
        
        return _QuestionMarkCircle!!
    }

private var _QuestionMarkCircle: ImageVector? = null

