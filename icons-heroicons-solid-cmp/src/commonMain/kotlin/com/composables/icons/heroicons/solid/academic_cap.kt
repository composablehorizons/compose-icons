package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.AcademicCap: ImageVector
    get() {
        if (_AcademicCap != null) return _AcademicCap!!
        
        _AcademicCap = ImageVector.Builder(
            name = "academic-cap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.7f, 2.805f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.6f, 0f)
                arcTo(60.65f, 60.65f, 0f, false, true, 22.83f, 8.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.231f, 1.337f)
                arcToRelative(49.948f, 49.948f, 0f, false, false, -9.902f, 3.912f)
                lineToRelative(-0.003f, 0.002f)
                curveToRelative(-0.114f, 0.06f, -0.227f, 0.119f, -0.34f, 0.18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.707f, 0f)
                arcTo(50.88f, 50.88f, 0f, false, false, 7.5f, 12.173f)
                verticalLineToRelative(-0.224f)
                curveToRelative(0f, -0.131f, 0.067f, -0.248f, 0.172f, -0.311f)
                arcToRelative(54.615f, 54.615f, 0f, false, true, 4.653f, -2.52f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.65f, -1.352f)
                arcToRelative(56.123f, 56.123f, 0f, false, false, -4.78f, 2.589f)
                arcToRelative(1.858f, 1.858f, 0f, false, false, -0.859f, 1.228f)
                arcToRelative(49.803f, 49.803f, 0f, false, false, -4.634f, -1.527f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.231f, -1.337f)
                arcTo(60.653f, 60.653f, 0f, false, true, 11.7f, 2.805f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.06f, 15.473f)
                arcToRelative(48.45f, 48.45f, 0f, false, true, 7.666f, -3.282f)
                curveToRelative(0.134f, 1.414f, 0.22f, 2.843f, 0.255f, 4.284f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.46f, 0.711f)
                arcToRelative(47.87f, 47.87f, 0f, false, false, -8.105f, 4.342f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.832f, 0f)
                arcToRelative(47.87f, 47.87f, 0f, false, false, -8.104f, -4.342f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.461f, -0.71f)
                curveToRelative(0.035f, -1.442f, 0.121f, -2.87f, 0.255f, -4.286f)
                curveToRelative(0.921f, 0.304f, 1.83f, 0.634f, 2.726f, 0.99f)
                verticalLineToRelative(1.27f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.14f, 2.508f)
                curveToRelative(-0.09f, 0.38f, -0.222f, 0.753f, -0.397f, 1.11f)
                curveToRelative(0.452f, 0.213f, 0.901f, 0.434f, 1.346f, 0.66f)
                arcToRelative(6.727f, 6.727f, 0f, false, false, 0.551f, -1.607f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.14f, -2.67f)
                verticalLineToRelative(-0.645f)
                arcToRelative(48.549f, 48.549f, 0f, false, true, 3.44f, 1.667f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.12f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.462f, 19.462f)
                curveToRelative(0.42f, -0.419f, 0.753f, -0.89f, 1f, -1.395f)
                curveToRelative(0.453f, 0.214f, 0.902f, 0.435f, 1.347f, 0.662f)
                arcToRelative(6.742f, 6.742f, 0f, false, true, -1.286f, 1.794f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _AcademicCap!!
    }

private var _AcademicCap: ImageVector? = null

