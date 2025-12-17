package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BookOpen: ImageVector
    get() {
        if (_BookOpen != null) return _BookOpen!!
        
        _BookOpen = ImageVector.Builder(
            name = "book-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 3.688f)
                arcToRelative(8.035f, 8.035f, 0f, false, false, -4.872f, -0.523f)
                arcTo(0.48f, 0.48f, 0f, false, false, 2f, 3.64f)
                verticalLineToRelative(7.994f)
                curveToRelative(0f, 0.345f, 0.342f, 0.588f, 0.679f, 0.512f)
                arcToRelative(6.02f, 6.02f, 0f, false, true, 4.571f, 0.81f)
                verticalLineTo(3.688f)
                close()
                moveTo(8.75f, 12.956f)
                arcToRelative(6.02f, 6.02f, 0f, false, true, 4.571f, -0.81f)
                curveToRelative(0.337f, 0.075f, 0.679f, -0.167f, 0.679f, -0.512f)
                verticalLineTo(3.64f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, -0.378f, -0.475f)
                arcToRelative(8.034f, 8.034f, 0f, false, false, -4.872f, 0.523f)
                verticalLineToRelative(9.268f)
                close()
            }
        }.build()
        
        return _BookOpen!!
    }

private var _BookOpen: ImageVector? = null

