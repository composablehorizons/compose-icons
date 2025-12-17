package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudSun: ImageVector
    get() {
        if (_CloudSun != null) return _CloudSun!!
        
        _CloudSun = ImageVector.Builder(
            name = "cloud-sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 8f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.5f, 3.555f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.624f, 0.492f)
                arcTo(1.503f, 1.503f, 0f, false, true, 13f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, true, true, 0.1f, -3.998f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.51f, -0.375f)
                arcTo(3.5f, 3.5f, 0f, false, true, 7f, 8f)
                moveToRelative(4.473f, 3f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -8.72f, -0.99f)
                arcTo(3f, 3f, 0f, false, false, 3f, 16f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveToRelative(3.743f, 1.964f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, -0.707f)
                lineToRelative(-0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                close()
                moveToRelative(-7.779f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0.707f)
                lineToRelative(0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, -0.708f)
                close()
                moveToRelative(1.734f, 3.374f)
                arcToRelative(2f, 2f, 0f, true, true, 3.296f, 2.198f)
                quadToRelative(0.3f, 0.423f, 0.516f, 0.898f)
                arcToRelative(3f, 3f, 0f, true, false, -4.84f, -3.225f)
                quadToRelative(0.529f, 0.017f, 1.028f, 0.129f)
                moveToRelative(4.484f, 4.074f)
                curveToRelative(0.6f, 0.215f, 1.125f, 0.59f, 1.522f, 1.072f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.039f, -0.742f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.854f, 0.377f)
                moveTo(14.5f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _CloudSun!!
    }

private var _CloudSun: ImageVector? = null

