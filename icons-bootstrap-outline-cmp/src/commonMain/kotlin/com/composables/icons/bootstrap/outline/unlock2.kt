package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Unlock2: ImageVector
    get() {
        if (_Unlock2 != null) return _Unlock2!!
        
        _Unlock2 = ImageVector.Builder(
            name = "unlock2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                curveToRelative(1.07f, 0f, 2.041f, 0.42f, 2.759f, 1.104f)
                lineToRelative(0.14f, 0.14f)
                lineToRelative(0.062f, 0.08f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.71f, 0.675f)
                lineToRelative(-0.076f, -0.066f)
                lineToRelative(-0.216f, -0.205f)
                arcTo(3f, 3f, 0f, false, false, 5f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14f, 8.5f)
                verticalLineToRelative(5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-7f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 13.5f)
                verticalLineToRelative(-5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2f, -2.45f)
                verticalLineTo(4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                moveTo(4.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 8.5f)
                verticalLineToRelative(5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 15f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 7f)
                close()
            }
        }.build()
        
        return _Unlock2!!
    }

private var _Unlock2: ImageVector? = null

