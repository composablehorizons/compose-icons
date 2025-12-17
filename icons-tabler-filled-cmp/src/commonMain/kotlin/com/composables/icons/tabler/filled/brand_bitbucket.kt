package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandBitbucket: ImageVector
    get() {
        if (_BrandBitbucket != null) return _BrandBitbucket!!
        
        _BrandBitbucket = ImageVector.Builder(
            name = "brand-bitbucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.661f, 3f)
                lineToRelative(16.68f, 0.007f)
                curveToRelative(0.484f, -0.005f, 0.946f, 0.203f, 1.262f, 0.57f)
                curveToRelative(0.316f, 0.368f, 0.454f, 0.856f, 0.364f, 1.396f)
                lineToRelative(-3.338f, 14.651f)
                arcToRelative(1.64f, 1.64f, 0f, false, true, -1.629f, 1.376f)
                horizontalLineToRelative(-10.01f)
                curveToRelative(-0.906f, -0.009f, -1.678f, -0.668f, -1.82f, -1.517f)
                lineToRelative(-3.148f, -14.576f)
                arcToRelative(1.64f, 1.64f, 0f, false, true, 1.639f, -1.907f)
                moveToRelative(11.339f, 5f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.986f, 1.164f)
                lineToRelative(1f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, 0.986f, 0.836f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 0.986f, -0.836f)
                lineToRelative(1f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.986f, -1.164f)
            }
        }.build()
        
        return _BrandBitbucket!!
    }

private var _BrandBitbucket: ImageVector? = null

