package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Radioactive: ImageVector
    get() {
        if (_Radioactive != null) return _Radioactive!!
        
        _Radioactive = ImageVector.Builder(
            name = "radioactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, 14f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.653f, 5.496f)
                arcTo(3f, 3f, 0f, false, false, 8f, 5f)
                curveToRelative(-0.61f, 0f, -1.179f, 0.183f, -1.653f, 0.496f)
                lineTo(4.694f, 2.992f)
                arcTo(5.97f, 5.97f, 0f, false, true, 8f, 2f)
                curveToRelative(1.222f, 0f, 2.358f, 0.365f, 3.306f, 0.992f)
                close()
                moveToRelative(1.342f, 2.324f)
                arcToRelative(3f, 3f, 0f, false, true, -0.884f, 2.312f)
                arcToRelative(3f, 3f, 0f, false, true, -0.769f, 0.552f)
                lineToRelative(1.342f, 2.683f)
                curveToRelative(0.57f, -0.286f, 1.09f, -0.66f, 1.538f, -1.103f)
                arcToRelative(6f, 6f, 0f, false, false, 1.767f, -4.624f)
                close()
                moveToRelative(-5.679f, 5.548f)
                lineToRelative(1.342f, -2.684f)
                arcTo(3f, 3f, 0f, false, true, 5.005f, 7.82f)
                lineToRelative(-2.994f, -0.18f)
                arcToRelative(6f, 6f, 0f, false, false, 3.306f, 5.728f)
                close()
                moveTo(10f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
            }
        }.build()
        
        return _Radioactive!!
    }

private var _Radioactive: ImageVector? = null

