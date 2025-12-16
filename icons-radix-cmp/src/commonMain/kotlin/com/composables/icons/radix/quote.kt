package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Quote: ImageVector
    get() {
        if (_Quote != null) return _Quote!!
        
        _Quote = ImageVector.Builder(
            name = "quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.42503f, 3.44136f)
                curveTo(10.0561f, 3.23654f, 10.7837f, 3.2402f, 11.3792f, 3.54623f)
                curveTo(12.7532f, 4.25224f, 13.3477f, 6.07191f, 12.7946f, 8f)
                curveTo(12.5465f, 8.8649f, 12.1102f, 9.70472f, 11.1861f, 10.5524f)
                curveTo(10.262f, 11.4f, 8.98034f, 11.9f, 8.38571f, 11.9f)
                curveTo(8.17269f, 11.9f, 8f, 11.7321f, 8f, 11.525f)
                curveTo(8f, 11.3179f, 8.17644f, 11.15f, 8.38571f, 11.15f)
                curveTo(9.06497f, 11.15f, 9.67189f, 10.7804f, 10.3906f, 10.236f)
                curveTo(10.9406f, 9.8193f, 11.3701f, 9.28633f, 11.608f, 8.82191f)
                curveTo(12.0628f, 7.93367f, 12.0782f, 6.68174f, 11.3433f, 6.34901f)
                curveTo(10.9904f, 6.73455f, 10.5295f, 6.95946f, 9.97725f, 6.95946f)
                curveTo(8.7773f, 6.95946f, 8.0701f, 5.99412f, 8.10051f, 5.12009f)
                curveTo(8.12957f, 4.28474f, 8.66032f, 3.68954f, 9.42503f, 3.44136f)
                close()
                moveTo(3.42503f, 3.44136f)
                curveTo(4.05614f, 3.23654f, 4.78366f, 3.2402f, 5.37923f, 3.54623f)
                curveTo(6.7532f, 4.25224f, 7.34766f, 6.07191f, 6.79462f, 8f)
                curveTo(6.54654f, 8.8649f, 6.11019f, 9.70472f, 5.1861f, 10.5524f)
                curveTo(4.26201f, 11.4f, 2.98034f, 11.9f, 2.38571f, 11.9f)
                curveTo(2.17269f, 11.9f, 2f, 11.7321f, 2f, 11.525f)
                curveTo(2f, 11.3179f, 2.17644f, 11.15f, 2.38571f, 11.15f)
                curveTo(3.06497f, 11.15f, 3.67189f, 10.7804f, 4.39058f, 10.236f)
                curveTo(4.94065f, 9.8193f, 5.37014f, 9.28633f, 5.60797f, 8.82191f)
                curveTo(6.06282f, 7.93367f, 6.07821f, 6.68174f, 5.3433f, 6.34901f)
                curveTo(4.99037f, 6.73455f, 4.52948f, 6.95946f, 3.97725f, 6.95946f)
                curveTo(2.7773f, 6.95946f, 2.0701f, 5.99412f, 2.10051f, 5.12009f)
                curveTo(2.12957f, 4.28474f, 2.66032f, 3.68954f, 3.42503f, 3.44136f)
                close()
            }
        }.build()
        
        return _Quote!!
    }

private var _Quote: ImageVector? = null

