package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Question_answer: ImageVector
    get() {
        if (_Question_answer != null) return _Question_answer!!
        
        _Question_answer = ImageVector.Builder(
            name = "question_answer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                lineToRelative(4f, 4f)
                verticalLineTo(6f)
                close()
                moveToRelative(-5f, 7f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(15f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Question_answer!!
    }

private var _Question_answer: ImageVector? = null

