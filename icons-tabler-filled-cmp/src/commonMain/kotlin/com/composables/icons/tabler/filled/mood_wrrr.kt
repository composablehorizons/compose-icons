package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MoodWrrr: ImageVector
    get() {
        if (_MoodWrrr != null) return _MoodWrrr!!
        
        _MoodWrrr = ImageVector.Builder(
            name = "mood-wrrr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                arcToRelative(10f, 10f, 0f, true, true, 0f, -20f)
                moveToRelative(3.707f, 12.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.262f, -0.125f)
                lineToRelative(-0.945f, 0.63f)
                lineToRelative(-0.945f, -0.63f)
                lineToRelative(-0.116f, -0.066f)
                arcToRelative(1f, 1f, 0f, false, false, -0.994f, 0.066f)
                lineToRelative(-0.945f, 0.63f)
                lineToRelative(-0.945f, -0.63f)
                arcToRelative(1f, 1f, 0f, false, false, -1.262f, 0.125f)
                lineToRelative(-1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(0.42f, -0.42f)
                lineToRelative(0.818f, 0.545f)
                lineToRelative(0.116f, 0.066f)
                arcToRelative(1f, 1f, 0f, false, false, 0.994f, -0.066f)
                lineToRelative(0.945f, -0.63f)
                lineToRelative(0.945f, 0.63f)
                lineToRelative(0.116f, 0.066f)
                arcToRelative(1f, 1f, 0f, false, false, 0.994f, -0.066f)
                lineToRelative(0.817f, -0.545f)
                lineToRelative(0.42f, 0.42f)
                arcToRelative(1f, 1f, 0f, false, false, 1.415f, -1.414f)
                close()
                moveToRelative(-6.5f, -6.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0.083f, 1.32f)
                lineToRelative(0.792f, 0.793f)
                lineToRelative(-0.792f, 0.793f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                close()
                moveToRelative(7f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.793f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
            }
        }.build()
        
        return _MoodWrrr!!
    }

private var _MoodWrrr: ImageVector? = null

